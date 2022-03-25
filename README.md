# Командный проект по курсу "Java для тестировщиков"

* [Цели проекта](#цели-проекта)
* [Чеклист готовности к работе над проектом](#Чеклист-готовности-к-работе-над-проектом)
* [Описание проекта](#Описание-проекта)
* [Сроки реализации проекта](#Сроки-реализации-проекта)
* [Инструкция к выполнению](#Инструкция-к-выполнению)
    * [1 этап](#1-этап)
    * [2 этап](#2-этап)
    * [3 этап](#3-этап)
    * [4 этап](#4-этап)
    * [5 этап](#5-этап)
* [Правила сдачи проекта](#Правила-сдачи-проекта)
* [Критерии оценки](#критерии-оценки)


## Цели проекта

Цель командного проекта - протестировать приложение для трекинга игровой активности.  
Вам предстоит:
- самостоятельно протестировать часть проекта
- составить баг-репорты на найденные баги
- закрыть баг-репорты, составленные вашим коллегой.

В результате выполнения командного проекта вы:
- получите практический опыт работы в команде
- прокачаете навыки коммуникации и умение выполнять задачи в срок
- закрепите навыки работы с GitHub
- потренируете навык проверки кода и совместной разработки.

## Чеклист готовности к работе над проектом

1. Изучили "Инструкцию по выполнению командного проекта" и "Правила работы в команде" в личом кабинете.
2. Знаете, кто с вами в команде.
3. Познакомились с напарником и определились, каким способом будете общаться (переписка в любом мессенджере, видеозвонки).
4. Договорились, кто будет размещать общий репозиторий проекта и отправлять его на проверку.
5. Изучили материалы лекции "Collections Framework. CRUD и тестирование систем, управляющих набором объектов".

Если все этапы чеклиста пройдены, то можете смело приступать к работе над проектом. Успехов в работе!

## Описание проекта

- В репозитории находится заготовка проекта, в котором есть классы  для трёх сущностей: игры (`Game`), игрока (`Player`), каталога игр (`GameStore`)

- Каждая игра принадлежит какому-то каталогу  

- Каждый игрок может добавить себе в коллекцию игру

- Также игрок может поиграть в добавленную игру через вызов своего метода `play`, тогда система записывает количество часов, которые он проиграл в игру

- Информация о проигранном времени хранится и в объекте игрока, и в объекте каталога игр, в чью игру он поиграл

- Также в классе игрока и каталога игр есть методы для подсчёта разного вида статистик по играм и игрокам.

- Над каждым методом в коде есть описание того, как он должен работать. При этом часть методов в этих классах не реализована, часть реализована с дефектами.

**Ваша задача** - исправить эти дефекты и дописать нереализованные методы.

## Сроки реализации проекта

1, 2 этапы: 1 день  
3 этап: 2 дня  
4 этап: 2 дня  
5 этап: 2 дня  
Отправка и обратная связь от проверяющего преподавателя: 3 дня  
Доработка по результатам (при необходимости): 2 дня  
Отправка и обратная связь от проверяющего преподавателя (при необходимости): 3 дня  

## Инструкция к выполнению

### 1 этап. Создание общего репозитория  

- Для размещения репозитория один из участников команды нажимает на кнопку `Fork` справа вверху этого репозитория с заданием

- Для предоставления доступа второму участнику необходимо зайти в `Settings` репозитория проекта, найти раздел `Collaborators`, кликнуть по кнопке `Add people`, добавить ник напарника и выбрать роль `Admin`.

### 2 этап. Распределение задач

- Участник А  будет поддерживать (исправлять дефекты и дописывать) класс `Player` и искать дефекты в классе `GameStore`

- Участник Б  будет поддерживать (исправлять дефекты и дописывать) класс `GameStore` и искать дефекты в классе `Player`

Отведите две ветки - `player` для исправления дефектов в `Player` и `gamestore` для исправления дефектов в `GameStore`.

### 3 этап. Поиск дефектов

- Участник А ищет дефекты класса `Player`, добавляя тесты в `PlayerTest` в ветке `player` и составляя на каждый найденный дефект баг-репорт

- Участник Б ищет дефекты класса `GameStore`, добавляя тесты в `GameStoreTest` в ветке `gamestore` и составляя на каждый найденный дефект баг-репорт

**Важно** - Никакие классы на этом этапе менять нельзя.

### 4 этап. Исправление дефектов и реализация методов  

- Участник А читает, какие баг-репорты завёл его коллега на  класс `Player`, и исправляет дефекты, делая коммиты в ветку `player`.  
 Никакие классы кроме класса `Player` при этом менять нельзя.
 
- Участник Б читает, какие баг-репорты завёл его коллега на  класс `GameStore`, и исправляет дефекты, делая коммиты в ветку `gamestore`.  
 Никакие классы кроме класса `GameStore` при этом менять нельзя.

### 5 этап. Проверка на дефекты  

- Оба участника возвращаются к этапу 3 "**Поиск дефектов**" и составляют новые баг-репорты

- Если новые дефекты  найдены, то участники переходят опять к этапу 4 "**Исправление дефектов и реализация методов**"

- Если дефектов в ветке не найдено, то участник, который поддерживает эту ветку делает `merge` в `main`, при необходимости разрешая конфликты. `merge` следует делать через `PullRequest`.

## Правила сдачи проекта

- Все дефекты исправлены и все ветки слиты в `main`
- Один участник команды добавил ссылку на публичный репозиторий в поле "Ссылка на решение" и в поле “Отправить на проверку эксперту” проставил галочку

## Критерии оценки проекта

В командном проекте будет оцениваться:
* какие дефекты были найдены каждым участиком команды, а также [как они были оформлены](https://github.com/netology-code/javaqa2-homeworks/blob/main/JAVA_INTRO.md#%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82-%D0%BE%D1%84%D0%BE%D1%80%D0%BC%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B1%D0%B0%D0%B3-%D1%80%D0%B5%D0%BF%D0%BE%D1%80%D1%82%D0%B0)
* какие дефекты были исправлены каждым участником команды, включая качество кода

В случае, если ряд важных багов выявлен не был, с подсказками проверяющего преподавателя возможно возвращение к этапу 4 для исправления упущенных дефектов.

**Зачет ставится обоим студентам при выполнении всех требований командного проекта**
