package com.example.Full_Ecommerce_App;

import com.example.Full_Ecommerce_App.DTO.Request.AddressRequest;
import com.example.Full_Ecommerce_App.DTO.Request.RegisterUserRequest;
import com.example.Full_Ecommerce_App.DTO.Response.UserRegisterResponse;
import com.example.Full_Ecommerce_App.Data.Model.Roles;
import com.example.Full_Ecommerce_App.Data.Model.Users;
import com.example.Full_Ecommerce_App.Data.Repository.UsersRepository;
import com.example.Full_Ecommerce_App.Services.UsersServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UsersTest {
    @Test
    void contextLoads() {
	}

        @Autowired
		private UsersRepository repository;

		@Autowired
		private UsersServices services;

    @BeforeEach
	void setUp() {
		repository.deleteAll();
	}

    @Test
		public void testThatICanHaveUsers() {
			 RegisterUserRequest request = new RegisterUserRequest();
			request.setFirstName("John");
			request.setLastName("Doe");
			request.setEmail("john.doe@example.com");
			request.setPhoneNumber("+1234567890");
			request.setPassword("password");
			request.setUserName("OBATURN28");
			request.setRoles(Roles.CUSTOMER);
			List<AddressRequest> addresses = new ArrayList<>();
			addresses.add(new AddressRequest("123 Main St", "Lagos", "Sabo Yaba", "100001", "Nigeria"));
			request.setAddressesRequest(addresses);

			UserRegisterResponse response = services.CreateUser(request);
			response.setMessage("user successfully registered");
			response.setStatus("201 , CREATED");
			assertNotNull(response);

			assertNotNull(response, "User successfully registered");
			assertEquals("John", response.getFirstName(), "First name should be John");
			assertEquals("Doe", response.getLastName(), "Last name should be Doe");
			assertEquals("john.doe@example.com", response.getEmail(), "Email should be john.doe@example.com");

			Optional<Users> user = repository.findByEmail("john.doe@example.com");
			assertNotNull(user, "User should be found in the database");

		}
		@Test
		public  void test_That_I_Can_Get_List_Of_All_Users() {
			RegisterUserRequest request = new RegisterUserRequest();
			request.setFirstName("John");
			request.setLastName("Doe");
			request.setPassword("toluak@28");
			request.setEmail("tolu@gmail.com");
			request.setRoles(Roles.CUSTOMER);
			request.setPhoneNumber("+1234567890");
			request.setUserName("obaturn");
			request.setPassword("1234");
			List<AddressRequest> addresses = new ArrayList<>();
			addresses.add(new AddressRequest("126 main land", "Lagos", "Sabo Yaba", "100001", "Nigeria"));
			request.setAddressesRequest(addresses);
			services.CreateUser(request);
			assertNotNull(request,"first user successfully register");

			RegisterUserRequest request1 = new RegisterUserRequest();
			request1.setFirstName("Johnny");
			request1.setLastName("Don");
			request1.setUserName("david28");
			request1.setEmail("tolwanidavid@gmail.com");
			request1.setPhoneNumber("08104375142");
			request1.setRoles(Roles.CUSTOMER);
			request1.setPassword("9099");
			List<AddressRequest> addressRequestList = new ArrayList<>();
			addressRequestList.add(new AddressRequest("256 oyo ", "OYO", "AGUNBELEWO","110234","NIGERIA"));
			request1.setAddressesRequest(addressRequestList);
			services.CreateUser(request1);
			assertNotNull(request1,"second user is created ");
			List<Users> usersList = services.getAllUsers();

			assertEquals(2,usersList.size(),"There should be two users");
			Users firstUser = usersList.get(0);
  			  Users secondUser = usersList.get(1);

    			assertEquals("John", firstUser.getFirstName(), "First user's first name should be John");
				assertEquals("Johnny", secondUser.getFirstName(), "Second user's first name should be Johnny");


		}

}
