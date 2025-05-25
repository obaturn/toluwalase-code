import React from "react";

const FeaturedProject = ({ image, title, description, year, role, DeployLink, github }) => {
    return (
        <div className="flex flex-col md:flex-row items-center md:items-start space-y-6 md:space-y-0 md:space-x-10 bg-gray-900 p-5 rounded-lg shadow-lg">

            <div className="w-full md:w-1/2">
                <span className="text-xs bg-gray-700 px-3 py-1 rounded-full text-white">Conceptual Work</span>
                <img src={image} alt={title} className="mt-4 w-full rounded-lg" />
            </div>


            <div className="w-full md:w-1/2 text-white">
                <h3 className="text-2xl font-semibold">{title}</h3>
                <p className="text-gray-400 mt-2">{description}</p>


                <div className="mt-4 border-t border-gray-700 pt-4">
                    <p className="text-gray-400">
                        <span className="font-semibold text-white">Year:</span> {year}
                    </p>
                    <p className="text-gray-400">
                        <span className="font-semibold text-white">Role:</span> {role}
                    </p>
                </div>


                <div className="mt-6 flex space-x-4">
                    <a href={DeployLink} target="_blank" rel="noopener noreferrer">
                        <button className="bg-yellow-500 text-black px-4 py-2 rounded-lg font-semibold">
                            DeployMent DEMO ↗
                        </button>
                    </a>
                    <a href={github} target="_blank" rel="noopener noreferrer">
                        <button className="flex items-center bg-gray-800 text-gray-300 px-4 py-2 rounded-lg">
                            SEE ON GITHUB 🐙
                        </button>
                    </a>
                </div>
            </div>
        </div>
    );
};

export default FeaturedProject;
