import React from 'react';
import { FaGithub, FaLinkedin, FaEnvelope } from 'react-icons/fa';
import {
    FaHtml5, FaCss3Alt, FaReact, FaSass, FaJs,
    FaBootstrap, FaGitAlt, FaFigma, FaNodeJs,
    FaDatabase, FaLeaf, FaFileCode, FaJava,
} from 'react-icons/fa';
import { SiDocker, SiPostgresql } from 'react-icons/si';

const Work = () => {
    return (
        <div className="text-white min-h-screen flex flex-col">

            {/* Top Section with Diagonal Split */}
            <div className="relative w-full flex flex-col md:flex-row min-h-[80vh]">

                {/* Left Side - Text */}
                <div className="w-full md:w-1/2 bg-gray-300 text-black flex flex-col justify-center items-start px-10 py-20 space-y-4 z-10">
                    <h2 className="text-lg">Hi, I am</h2>
                    <h1 className="text-4xl md:text-5xl font-bold">Akintoye Toluwalase</h1>
                    <p className="text-gray-600 text-sm md:text-base">Front-end Developer / UI Designer</p>
                    <div className="flex space-x-4 mt-4">
                        <a href="mailto:akintoyetoluwalase912@gmail.com" className="bg-white p-2 rounded shadow hover:scale-105 transition">
                            <FaEnvelope className="text-black" />
                        </a>
                        <a href="https://github.com/your-username" target="_blank" rel="noopener noreferrer" className="bg-white p-2 rounded shadow hover:scale-105 transition">
                            <FaGithub className="text-black" />
                        </a>
                        <a href="https://linkedin.com/in/your-link" target="_blank" rel="noopener noreferrer" className="bg-white p-2 rounded shadow hover:scale-105 transition">
                            <FaLinkedin className="text-black" />
                        </a>
                    </div>
                </div>

                {/* Right Side - Diagonal Split with Image */}
                <div className="w-full md:w-1/2 bg-black relative overflow-hidden">
                    <div className="absolute inset-0 clip-diagonal bg-black z-0" />
                    <div className="relative z-10 flex justify-center items-center h-full p-4">
                        <img
                            src="https://res.cloudinary.com/dkrpginfm/image/upload/v1743426518/send4-removebg-preview_l5yvit.png"
                            alt="Profile"
                            className="w-3/4 max-w-md object-cover"
                        />
                    </div>
                </div>
            </div>

            {/* Skills Section */}
            <div className="bg-gray-900 py-12 px-6">
                <h3 className="text-2xl font-semibold text-center mb-8 text-amber-300 border-b-4 w-fit mx-auto px-4 py-2">SKILLS</h3>
                <div className="grid grid-cols-2 md:grid-cols-4 gap-8 text-4xl justify-items-center">
                    <FaHtml5 className="text-orange-500" title="HTML5" />
                    <FaCss3Alt className="text-blue-500" title="CSS3" />
                    <FaJs className="text-yellow-400" title="JavaScript" />
                    <FaReact className="text-cyan-400" title="React" />
                    <FaNodeJs className="text-green-500" title="Node.js" />
                    <FaSass className="text-pink-400" title="Sass" />
                    <FaBootstrap className="text-purple-600" title="Bootstrap" />
                    <FaGithub className="text-white" title="GitHub" />
                    <FaFigma className="text-pink-500" title="Figma" />
                    <FaGitAlt className="text-red-500" title="Git" />
                    <FaDatabase className="text-indigo-400" title="Database" />
                    <FaLeaf className="text-green-400" title="MongoDB" />
                    <FaFileCode className="text-red-300" title="Code" />
                    <SiDocker className="text-blue-500" title="Docker" />
                    <SiPostgresql className="text-sky-400" title="PostgreSQL" />
                    <FaJava className="text-red-500" title="Java" />
                </div>
            </div>
        </div>
    );
};

export default Work;
