import React, {useEffect, useState} from 'react';
import {MainMenu} from "../MainMenu/MainMenu";
import {MainMenu_1} from "../MainMenu_1/MainMenu_1";
import {MainMenu_2} from "../MainMenu_2/MainMenu_2";
import {MainMenu_3} from "../MainMenu_3/MainMenu_3";
import {ErrorWindow} from "../ErrorWindow/ErrorWindow";
import {ServiceInfoStatus} from "../ResponseItems/ServiceInfoStatus/ServiceInfoStatus";
import css from "./MainContent.module.css"

export function MainContent({value}) {
    const [content, setContent] = useState(null)

    useEffect(()=>{
        let result
        switch (value) {
            case 'sub49': result = <MainMenu/>; break;
            case 'sub410': result = <MainMenu_1/>; break;
            case 'sub411': result = <MainMenu_2/>; break;
            case 'sub412': result = <MainMenu_3/>; break;
            case 'sub89': result =  <ServiceInfoStatus value={value}/>; break;
            default : result = <ErrorWindow/>

        }
        setContent(result)
    },[value])

    return (
        <div className={css.content}>
            {content}
        </div>
    );
}




