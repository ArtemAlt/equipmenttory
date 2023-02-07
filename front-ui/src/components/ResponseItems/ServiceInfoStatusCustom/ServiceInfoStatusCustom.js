import React from 'react';

export const ServiceInfoStatusCustom = ({infos}) => {

    const infoStyle = {
        border: 'thick double #32a1ce',
    }
    return(
        <div style={infoStyle}>
            <h3>{infos.serviceName}</h3>
            <h4>{infos.status}</h4>
        </div>
    );

};

