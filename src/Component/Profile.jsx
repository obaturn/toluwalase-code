import React from 'react';

const Profile = () => {
    return (
        <div className="bg-black flex justify-between items-center min-h-screen px-6">


            <div className="w-1/2">
                <h2 className="text-2xl font-bold text-white">
                    HI, I AM <br /> AKINTOYE TOLUWALASE
                </h2>
                <p className="mt-4 text-lg text-blue-700">
                    A Nigeria-based Full-Stack Developer passionate about building
                    accessible and user-friendly websites.
                </p>
                <div className="mt-6 flex items-center space-x-4">
                    <button className="bg-yellow-300 text-black font-semibold py-2 px-4 rounded-full hover:bg-lime-500 transition">
                        CONTACT ME
                    </button>
                </div>
            </div>


            <div className="w-1/2 flex justify-center">
                <div className="w-80 h-96 bg-gray-200 rounded-xl overflow-hidden">
                    <img
                        src="https://res.cloudinary.com/dkrpginfm/image/upload/v1743426518/send4-removebg-preview_l5yvit.png"
                        alt="Profile"
                        className="w-full h-full object-cover"
                    />
                </div>
            </div>

        </div>
    );
};

export default Profile;
