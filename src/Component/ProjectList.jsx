import React from "react";
import FeaturedProject from "./FeaturedProject";

const projects = [
    {
        image: "https://res.cloudinary.com/dkrpginfm/image/upload/v1743432698/sport1_go9zcw.png",
        title: "Spotify Platform Dashboard",
        description:
            "Teamed up with a designer to breathe life into a Spotify  webpage for our beloved music. Delivered a fully responsive design with dynamic content capabilities, seamlessly integrating a Streaming music feature.",
        year: "2023",
        role: "Front-end Developer",
        DeployLink: "https://your-live-demo-link.com",
        github: "https://github.com/your-github-repo",
    },
    {
        image: "https://res.cloudinary.com/dkrpginfm/image/upload/v1740817857/super_market_lcis3a.png",
        title: "E-commerce Dashboard",
        description:
            "Built a modern, fully responsive e-commerce dashboard with interactive charts, analytics, and a seamless user experience.",
        year: "2024",
        role: "Full-Stack Developer",
        DeployLink: "https://another-live-demo.com",
        github: "https://github.com/another-repo",
    },
    {
        image: "https://res.cloudinary.com/dkrpginfm/image/upload/v1743432676/Chat-app_eadtjf.png",
        title: "Chat App ",
        description:
            "Developed A Chat App  using React and Spring boot FrameWork For Java, featuring Web Socket  and Socks JS.",
        year: "2025",
        role: "Full-Stack Developer",
        DeployLink: "https://chatbot-demo.com",
        github: "https://github.com/chatbot-repo",
    },
];

const ProjectsList = () => {
    return (
        <div className="min-h-screen bg-black text-white px-10 py-20">

            <h2 className="text-3xl font-bold">FEATURED PROJECTS</h2>
            <p className="text-gray-400 mt-2">
                Here are some of the selected projects that showcase my passion for front-end development.
            </p>


            <div className="mt-10 space-y-10">
                {projects.map((project, index) => (
                    <FeaturedProject key={index} {...project} />
                ))}
            </div>
        </div>
    );
};

export default ProjectsList;
