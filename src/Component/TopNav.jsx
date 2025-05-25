import React from "react";
import { Link } from "react-router-dom";

function TopNav() {
    return (
        <>
            <div className="bg-black text-white flex justify-between items-center py-4 px-6">
                <h2 className="text-sm font-bold">Akintoye Toluwalase</h2>
                <ul className="flex space-x-6 text-xs">
                    <li className="hover:underline cursor-pointer">
                        <Link to="/work">Work</Link>
                    </li>
                    <li className="hover:underline cursor-pointer">
                        <Link to="/contact">Contact</Link >
                    </li>
                    <li className="hover:underline cursor-pointer">
                        <Link to="/about">About</Link>
                    </li>
                </ul>
            </div>
        </>
    );
}

export default TopNav;
