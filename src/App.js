import React from "react";
import { BrowserRouter as Router, Route, Routes, useLocation } from "react-router-dom";
import TopNav from "./Component/TopNav";
import ProjectList from "./Component/ProjectList";
import Connect from "./Component/Connect";
import About from "./Component/About";
import Profile from "./Component/Profile";
import Contact from "./Component/Contact";
import Work from "./Component/Work";

function AppWrapper() {
    const location = useLocation();


    const showProject = location.pathname === "/" || location.pathname === "/work";
    const showConnect = location.pathname === "/"
        || location.pathname === "/about"
        || location.pathname === "/work";

    return (
        <div className="App">
            <TopNav />
            <Routes>
                <Route path="/" element={<Profile />} />
                <Route path="/about" element={<About />} />
                <Route path="/contact" element={<Contact />} />
                <Route path="/work" element={<Work />} />
            </Routes>

            {showProject && <ProjectList />}
            {showConnect && <Connect />}
        </div>
    );
}

function App() {
    return (
        <Router>
            <AppWrapper />
        </Router>
    );
}

export default App;
