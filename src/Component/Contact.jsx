import React from 'react';

const Contact = () => {
    return (
        <div className="min-h-screen bg-gray-950 text-white flex flex-col items-center justify-center p-6">

            <div className="flex flex-col sm:flex-row items-center text-left gap-6 mb-10">
                <div>
                    <h1 className="text-xl sm:text-2xl font-semibold">Hi 👋,</h1>
                    <h2 className="text-2xl sm:text-3xl font-bold">My name is <span className="text-indigo-400">Akintoye Toluwalase</span></h2>
                    <p className="text-lg">I build things for the web And Mobile</p>
                </div>
                <img
                    src="https://res.cloudinary.com/dkrpginfm/image/upload/v1743508922/WhatsApp_Image_1_nab0oa.jpg"
                    alt="Profile"
                    className="w-28 h-28 rounded-full object-cover border-4 border-transparent bg-gradient-to-tr from-pink-500 to-blue-500 p-1"
                />
            </div>


            <div className="w-full max-w-md bg-gray-800 p-6 rounded-xl shadow-md">
                <form className="flex flex-col gap-4">
                    <input
                        type="text"
                        placeholder="Your Name"
                        className="p-3 rounded bg-gray-700 text-white focus:outline-none focus:ring-2 focus:ring-indigo-500"
                        required
                    />
                    <input
                        type="email"
                        placeholder="Your Email"
                        className="p-3 rounded bg-gray-700 text-white focus:outline-none focus:ring-2 focus:ring-indigo-500"
                        required
                    />
                    <textarea
                        placeholder="Your Message"
                        className="p-3 rounded bg-gray-700 text-white focus:outline-none focus:ring-2 focus:ring-indigo-500"
                        rows="4"
                        required
                    />
                    <button
                        type="submit"
                        className="bg-indigo-500 hover:bg-indigo-600 transition-colors text-white py-2 px-4 rounded font-semibold"
                    >
                        Send Message
                    </button>
                </form>
                <div className="mt-6 text-center text-sm">
                    <p>📞 Phone: <a href="tel:08104375142" className="text-indigo-400 hover:underline">08104375142</a></p>
                    <p>📧 Email: <a href="mailto:akintoyetoluwalase912@gmail.com" className="text-indigo-400 hover:underline">akintoyetoluwalase912@gmail.com</a></p>
                </div>
            </div>
        </div>
    );
};

export default Contact;
