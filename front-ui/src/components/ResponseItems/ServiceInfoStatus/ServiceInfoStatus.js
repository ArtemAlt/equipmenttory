import React, {useEffect, useState} from 'react';
import {Card, Col, Row} from "antd";
import {API_URL_HEALTH_CHECK} from "../../../urls/urls";

export const ServiceInfoStatus = ({value}) => {
    const [advice, setAdvice] = useState([])

    useEffect(() => {
        const url = API_URL_HEALTH_CHECK
        const fetchData = async () => {
            try {
                const response = await fetch(url);
                const json = await response.json();
                console.log(json.info);
                setAdvice(json.info)
            } catch (error) {
                console.log("error", error);
            }
        };
        fetchData()
    }, [value]);

    return (
        <>
            <Row gutter={16}>
                {advice.map((item, i) => (
                    <Col key={i} span={5}>
                        <Card title={item.serviceName}>
                            {item.status}
                        </Card>
                    </Col>
                ))}
            </Row>
        </>
    );

}
