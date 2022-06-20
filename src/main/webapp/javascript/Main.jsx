import React, { Component } from "react";
import ReactDOM from 'react-dom';

class Main extends Component {
    render() {
        return (
            <div>
                <h1>Demo Component</h1>
                <img src="https://picsum.photos/200/300"/>
            </div>
        );
    }
}

ReactDOM.render(
    <Main />,
    document.getElementById('root')
);