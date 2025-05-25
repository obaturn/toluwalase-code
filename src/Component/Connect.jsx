import React, { useState } from "react";

const Connect = () => {
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [subject, setSubject] = useState("");
    const [message, setMessage] = useState("");

    return (
        <div className="flex flex-col lg:flex-row justify-between items-start bg-black text-white p-12 min-h-screen">

            <div className="w-full lg:w-1/2">
                <h2 className="text-5xl font-bold mb-4">LET'S CONNECT</h2>
                <p className="text-gray-400 mb-4">
                    Say hello at
                    <a
                        href="mailto:robertgarcia@gmail.com"
                        className="text-yellow-400 ml-2 underline hover:text-yellow-300"
                    >
                        Akintoyetoluwalase912@gmail.com
                    </a>
                </p>
                <p className="text-gray-400 mb-6">
                    For more info, here's
                    <a
                        href="/resume"
                        className="text-yellow-400 ml-2 underline hover:text-yellow-300"
                    >
                        my resume
                    </a>
                </p>
                <div className="flex space-x-4 text-yellow-400 text-2xl">
                    <a href="https://www.linkedin.com/in/akintoye-toluwalase-609650302" target="_blank" rel="noopener noreferrer">🔗</a>
                    <a href="https://github.com/obaturn" target="_blank" rel="noopener noreferrer">⚡</a>
                    <a href="https://instagram.com" target="_blank" rel="noopener noreferrer">📸</a>
                </div>
            </div>


            <div className="w-full lg:w-1/2 mt-8 lg:mt-0">
                <form className="space-y-4">
                    <div>
                        <label className="block text-gray-400">Name</label>
                        <input
                            type="text"
                            value={name}
                            onChange={(e) => setName(e.target.value)}
                            className="w-full p-3 bg-gray-800 border-none rounded-md text-white focus:outline-none"
                            placeholder="Akintoye Toluwalase"
                        />
                    </div>
                    <div>
                        <label className="block text-gray-400">Email</label>
                        <input
                            type="email"
                            value={email}
                            onChange={(e) => setEmail(e.target.value)}
                            className="w-full p-3 bg-gray-800 border-none rounded-md text-white focus:outline-none"
                        />
                    </div>
                    <div>
                        <label className="block text-gray-400">Subject</label>
                        <input
                            type="text"
                            value={subject}
                            onChange={(e) => setSubject(e.target.value)}
                            className="w-full p-3 bg-gray-800 border-none rounded-md text-white focus:outline-none"
                        />
                    </div>
                    <div>
                        <label className="block text-gray-400">Message</label>
                        <textarea
                            value={message}
                            onChange={(e) => setMessage(e.target.value)}
                            className="w-full p-3 bg-gray-800 border-none rounded-md text-white focus:outline-none"
                            rows="4"
                        />
                    </div>
                    <button
                        type="submit"
                        className="px-6 py-2 bg-yellow-400 text-black font-bold rounded-md hover:bg-yellow-300"
                    >
                        SUBMIT
                    </button>
                </form>
            </div>


            <footer className="absolute bottom-4 left-4 text-gray-500 text-sm">
                © 2023 Akintoye Toluwalase. All rights reserved.
                <br />
            </footer>
        </div>
    );
};

export default Connect;
