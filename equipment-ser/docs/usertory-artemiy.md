Userstory однако. Хотели - нате.

Задолбало собирать информацию, по разным раскиданным тектовым и excel-файликам, СЭД и просто людям которые что-то помнят...
Как отчет или инвентаризация - хоть стреляйся.

Хочется странный продукт:

Расположение серверов и прочего оборудования по серверным помещениям и стойкам и вся могущая понадобится по ним информация.

Оттуда соответственно получать:
1. Что и где стоит, из нашего оборудования. 
(Формат данных локации - 
	Город,
	улица,
	номер дома,
	?корпус,
	помещение (Это серверная: формат данных -					
					номер помещения,
					?площадь помещения,
					?примечание(написать что угодно для общей информации)
	?примечание(написать что угодно для общей информации))
	
	
2. Конфигурацию каждой конкретной железки, что в ней есть (модель, процы, память, диски, сеть, адреса, 
порты и в какие девайсы это всё подключено, физические размеры, система управления, ответственные,
 у кого брать ключи, сегмент сети куда эта ересь смотрит и подобное, надо подумать, что еще может понадобится).
 (Формат данных - 
	Модель,
	Тип оборудования,
	Производитель,
	?Вид,	
	?Габариты - 
		?Размер в юнитах
		?Физические зармеры ШхВхГ
	?Метод коммутации,
	?Вид размещения (прм. монтируемые в стойку, настольный)
	?Порты - 
		Общее количество портов,
		Количество портов 100 Мбит/сек,
		Количество портов 1 Гбит/сек,
		Количество портов 10 Гбит/сек,
		Поддержка PoE,
		Количество портов PoE,
		Количество SFP-портов,
		Консольный порт)
	?Производительность - 
		Размер таблицы МАС адресов,
		Внутренняя пропускная способность,
		Скорость обслуживания пакетов,
		Буфер пакетов
	?Функционал и ПО - 
		Поддержка стандартов,
		Версия ПО
	?Потребляемая мощность)
	
Пример: 
{
  "model": "TL-SF1024D",
  "type": "коммутатор",
  "manufacturer": "TP-Link",
  "kind": "неуправляемый",
  "dimensions": {
    "inU": "1U",
    "profile": {
      "Width": "294",
      "Depth": "180",
      "Height": "44"
    }
  },
  "connection_type": "store-and-forward",
  "accommodation_type": "стоечный",
  "ports_information": {
    "total": "24",
    "total_100m": "24",
    "total_1G": "0",
    "total_10G": "0",
    "POE_support": "NO",
    "POE_ports": "0",
    "SFP_ports": "0",
    "console_port": "NO"
  }
}
3. Инвентарную информацию, дабы осчастливить нас бедных, во время очередной инвентаризации 
(серийный, инвентарный номера и тыды). учесть в п.2


4. Возможность по каждой железке задокументировать, всякую фигню - обновления прошивок, замену всяческих модулей 
и прочую ересь
5. В режиме редактирования, плюшки: возможность посмотреть, куда можно впихнуть конкретную железку,
исходя из физических размеров, наличия свободных pdu/ups дырок и еще чего-нибудь, что придумаем.
6. Отчеты. Из того что надо нам - сформировать отчет по конкретной серверной, по стойкам, вид с фронта и тыла, 
с метками, какое устройство установлено. По серверам и сетевым железкам - на каждую железяку отчет с её данными, 
как по инвентаризации, так и по проведенным работам, заменам железяк, обновлениям firmware, 
на основании каких документов на закупку/ремонт/модернизацию это всё производилось. 
Отчеты по периодическому ТО - типа осмотры, продувки и тыды (да-да, у нас прям в нормативке прописаны некоторые вещи). 
Сюда же информацию по всяким дополнительно установленным СЗИ (доп платы, заклейки с номерами и прочая ересь).
 Крайне желательно уметь это всё пихать в pdf, excel, word.
7. Естественно, что всё это будут делать не анонимные какие людя, а вполне себе авторизованные, 
то бишь какую-то безопасность с парой-тройкой уровней прикрутить надо (админ, редактор, смотритель на отчеты).

Дальше тут уже полёт фантазии:
 - можно попробовать к этому всему прикрутить какой-то discovery service для обнаружения оборудования, 
 но тут я хз как это всё делать, SNMP что-ли попробовать...
 - расчет по электропотреблению, можно в принципе данные попробовать снимать.
 - расчеты по теплу и охлаждению как у больших дядь во всяких там ДЦ, 
 но это надо будет уже всяких хфизиков/математиков насиловать в мозг со строителями вместе.
 - опять же с того же snmp снимать данные по температуре, потреблению, загрузке ресурсов 
 (и не дай боги пихать это не в time-series db... застрелиться от тоски можно нафиг).
 - еще можно с мониторинговых всяких хреней собирать алерты по фильтру, например по сбоям железа и пихать к себе.
 А к ним при желании навернуть всякое, что мол проведена замена дисков после вылета, обновление fw для убирания глюков...

Пока наверное всё, по моему тут надо уже с mvp определяться и смотреть, что из этого вообще реализуемо =)
