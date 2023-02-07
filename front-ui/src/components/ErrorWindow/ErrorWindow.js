import React, {Component} from 'react';
import css from "./ErroreWindow.module.css"
export class ErrorWindow extends Component {
    render() {
        return (
            <div className={css.content}>
                ERROR
            </div>
        );
    }
}

