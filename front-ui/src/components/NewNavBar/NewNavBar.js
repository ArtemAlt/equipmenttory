import React from 'react';
import {Menu} from 'antd'
import type {MenuProps} from 'antd';
import {AppstoreOutlined, MailOutlined, SettingOutlined} from '@ant-design/icons';
import css from "./NewNavBar.module.css"


export const NewNavBar = ({value, onChange}) => {
    type MenuItem = Required<MenuProps>['items'][number];

    function getItem(
        label: React.ReactNode,
        key?: React.Key | null,
        icon?: React.ReactNode,
        children?: MenuItem[],
        type?: 'group',
    ): MenuItem {
        return {
            key,
            icon,
            children,
            label,
            type,
        }
    }

    const items: MenuItem[] = [
        getItem('Домашняя', 'sub4', <AppstoreOutlined/>, [
            getItem('Option 9', 'sub49'),
            getItem('Option 10', 'sub410'),
            getItem('Option 11', 'sub411'),
            getItem('Option 12', 'sub412'),
        ]),
        getItem('Оборудование', 'sub5', <AppstoreOutlined/>, [
            getItem('Все доступное', 'sub59'),
            getItem('Редактировать', 'sub510'),
            getItem('Добавить новое', 'sub511'),
            getItem('Option 12', 'sub512'),
        ]),
        getItem('Серверные', 'sub6', <AppstoreOutlined/>, [
            getItem('Option 9', 'sub69'),
            getItem('Option 10', 'sub610'),
            getItem('Option 11', 'sub611'),
            getItem('Option 12', 'sub612'),
        ]),
        getItem('Стойки', 'sub7', <AppstoreOutlined/>, [
            getItem('Option 9', 'sub79'),
            getItem('Option 10', 'sub710'),
            getItem('Option 11', 'sub711'),
            getItem('Option 12', 'sub712'),
        ]),
        getItem('Настройки', 'sub8', <SettingOutlined/>, [
            getItem('Состояние системы', 'sub89'),
            getItem('Option 10', 'sub810'),
            getItem('Option 11', 'sub811'),
            getItem('Option 12', 'sub812'),
        ]),
    ];

    const onClick: MenuProps['onClick'] = (e) => {
        onChange(e.key);

    };
    return (
        <div className={css.nav}>
            <Menu onClick={onClick} style={{width: 200}} mode="vertical" items={items}/>
        </div>

    );
};

export default NewNavBar;