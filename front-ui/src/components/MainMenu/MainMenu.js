import React from 'react';
import css from "./MAinMenu.module.css"
export function MainMenu ()  {

        return (
            <div className={css.content}>
                <label>Данные</label>
                <input placeholder="Текст"></input>
                <button type="submit">Oтправить</button>
            </div>
        );

}

