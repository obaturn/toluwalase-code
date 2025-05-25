import React from 'react';
import Connect from "./Connect";

const About = () => {
    return (
        <div className="bg-gray-950 h-screen flex flex-col items-center justify-center text-center p-4">
            <h1 className="text-white font-serif text-4xl sm:text-4xl mb-2">Hi</h1>
            <h2 className="text-white text-2xl  md:text-3xl mb-4">My Name Is Akintoye Toluwalase</h2>
            <p className="text-white text-lg mb-4 sm:text-lg md:text-xl">
                I am a passionate web developer with experience in building dynamic and responsive web and mobile applications.
                I enjoy learning new technologies and improving my skills.
            </p>
            <p className="text-white text-lg mb-6">
                I am a graduate of Semicolon Africa and I am proficient in Java using frameworks like Spring Boot, as well as C# with the ASP.NET framework.
                I also have experience building modern web and mobile applications using React, Next.js, React Native, and Flutter.
            </p>
            <img
                src="https://res.cloudinary.com/dkrpginfm/image/upload/v1743508922/WhatsApp_Image_1_nab0oa.jpg"
                alt="Profile"
                className="w-32 h-32 rounded-full mt-4"
            />

        </div>


    );
};

export default About;