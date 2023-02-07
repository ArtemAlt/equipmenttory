import React, {useState} from "react";
import css from './App.module.css';
import {Header} from "./components/Header/Header";
import NewNavBar from "./components/NewNavBar/NewNavBar";
import {MainContent} from "./components/MainContent/MainContent";




function App() {
    const [currentContent,setCurrentContent] = useState();

    return (
        <div className={css.app}>
            <Header/>
            <NewNavBar value = {currentContent} onChange = {setCurrentContent} />
            <MainContent value = {currentContent}/>
        </div>
    );
}

export default App;
