import React from 'react';
import css from "./Header.module.css"
import logo from "./../../logos/free-logo-h2xaf0d7ow-ivv70phqq4.jpg"


export function Header(){

        return (
                <header className={css.header}>
                    <div><img className={css.logo} src={logo}/></div>
                </header>
        );
}
