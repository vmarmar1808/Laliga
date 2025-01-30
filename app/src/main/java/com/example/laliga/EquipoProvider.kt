package com.example.laliga

class EquipoProvider {
    companion object {
        val listaEquipos = listOf<Equipo>(
            // Equipos del Grupo 1
            Equipo(
                id = 1,
                nombre = "Athletic B",
                grupo = "Grupo 1",
                estadio = "Lezama",
                logo = "https://cdn.resfu.com/img_data/equipos/348.png",
                info = "Equipo filial del Athletic Club con una larga tradición en el fútbol español."
            ),
            Equipo(
                id = 2,
                nombre = "Barakaldo",
                grupo = "Grupo 1",
                estadio = "Estadio de Sarriena",
                logo = "https://cdn.resfu.com/img_data/equipos/425.png",
                info = "Club con historia en el fútbol vasco y español, participa en varias competiciones."
            ),
            Equipo(
                id = 3,
                nombre = "Osasuna B",
                grupo = "Grupo 1",
                estadio = "El Sadar",
                logo = "https://cdn.resfu.com/img_data/equipos/327.png",
                info = "El filial de Osasuna, conocido por su fuerte conexión con la cantera."
            ),
            Equipo(
                id = 4,
                nombre = "Arenteiro",
                grupo = "Grupo 1",
                estadio = "Estadio de Espiñedo",
                logo = "https://cdn.resfu.com/img_data/equipos/249.png",
                info = "Es un club gallego con una rica historia en el fútbol regional."
            ),
            Equipo(
                id = 5,
                nombre = "Lugo",
                grupo = "Grupo 1",
                estadio = "Anxo Carro",
                logo = "https://cdn.resfu.com/img_data/equipos/1598.png",
                info = "Conocido por su fuerte base de aficionados y cantera en Galicia."
            ),
            Equipo(
                id = 6,
                nombre = "Cultural Leonesa",
                grupo = "Grupo 1",
                estadio = "Estadio Municipal Reino de León",
                logo = "https://cdn.resfu.com/img_data/equipos/877.png",
                info = "Individualmente una de las entidades futbolísticas más antiguas de España."
            ),
            Equipo(
                id = 7,
                nombre = "Andorra",
                grupo = "Grupo 1",
                estadio = "Estadi Nacional",
                logo = "https://cdn.resfu.com/img_data/equipos/9501.png",
                info = "Club que ha tenido un ascenso notable en el fútbol español en años recientes."
            ),
            Equipo(
                id = 8,
                nombre = "Barcelona Atlètic",
                grupo = "Grupo 1",
                estadio = "Estadi Johan Cruyff",
                logo = "https://cdn.resfu.com/img_data/equipos/430.png",
                info = "Filial del FC Barcelona que potencia el talento joven."
            ),
            Equipo(
                id = 9,
                nombre = "Nàstic",
                grupo = "Grupo 1",
                estadio = "Nou Estadi",
                logo = "https://cdn.resfu.com/img_data/equipos/1228.png",
                info = "Un club con mucha historia en el fútbol catalán, ubicado en Tarragona."
            ),
            Equipo(
                id = 10,
                nombre = "Segoviana",
                grupo = "Grupo 1",
                estadio = "Estadio Municipal de La Albuera",
                logo = "https://cdn.resfu.com/img_data/equipos/5715.png",
                info = "Tiene una ferviente afición local y busca el avance en las ligas españolas."
            ),
            Equipo(
                id = 11,
                nombre = "Ourense",
                grupo = "Grupo 1",
                estadio = "Estadio de Pasarón",
                logo = "https://cdn.resfu.com/img_data/equipos/9401.png",
                info = "Club con un legado en el fútbol gallego y un gran apoyo comunitario."
            ),
            Equipo(
                id = 12,
                nombre = "Celta Fortuna",
                grupo = "Grupo 1",
                estadio = "Estadio de Balaídos",
                logo = "https://cdn.resfu.com/img_data/equipos/713.png",
                info = "Filial del RC Celta de Vigo y portavoz del fútbol base en Galicia."
            ),
            Equipo(
                id = 13,
                nombre = "Real Sociedad B",
                grupo = "Grupo 1",
                estadio = "Zubieta",
                logo = "https://cdn.resfu.com/img_data/equipos/2121.png",
                info = "Promueve talentos jóvenes para la primera plantilla de la Real Sociedad."
            ),
            Equipo(
                id = 14,
                nombre = "Real Unión",
                grupo = "Grupo 1",
                estadio = "Estadio Gal",
                logo = "https://cdn.resfu.com/img_data/equipos/2130.png",
                info = "Conocido por su rica historia y su afición apasionada en Irún."
            ),
            Equipo(
                id = 15,
                nombre = "Amorebieta",
                grupo = "Grupo 1",
                estadio = "Estadio de Unbe",
                logo = "https://cdn.resfu.com/img_data/equipos/213.png",
                info = "Padre del fútbol en el norte de España, con un fuerte enfoque comunitario."
            ),
            Equipo(
                id = 16,
                nombre = "Ponferradina",
                grupo = "Grupo 1",
                estadio = "El Toralín",
                logo = "https://cdn.resfu.com/img_data/equipos/3287.png",
                info = "Club con un fuerte carácter y un rendimiento notable en el fútbol español."
            ),
            Equipo(
                id = 17,
                nombre = "Tarazona",
                grupo = "Grupo 1",
                estadio = "Municipal de Tarazona",
                logo = "https://cdn.resfu.com/img_data/equipos/2466.png",
                info = "Conocido por su ambición de ascender y su pasión por el juego."
            ),
            Equipo(
                id = 18,
                nombre = "Sestao River",
                grupo = "Grupo 1",
                estadio = "Las Llanas",
                logo = "https://cdn.resfu.com/img_data/equipos/2309.png",
                info = "Un club que lucha por recuperar su lugar en las ligas superiores."
            ),
            Equipo(
                id = 19,
                nombre = "Unionistas de Salamanca",
                grupo = "Grupo 1",
                estadio = "El Helmántico",
                logo = "https://cdn.resfu.com/img_data/equipos/54657.png",
                info = "Fundado por aficionados que querían preservar el legado del fútbol en Salamanca."
            ),
            Equipo(
                id = 20,
                nombre = "Zamora",
                grupo = "Grupo 1",
                estadio = "Los Pajaritos",
                logo = "https://cdn.resfu.com/img_data/equipos/2785.png",
                info = "Con una rica historia en el fútbol español, siempre compite con pasión."
            ),

            // Equipos del Grupo 2
            Equipo(
                id = 21,
                nombre = "Alcorcón",
                grupo = "Grupo 2",
                estadio = "Estadio de Santo Domingo",
                logo = "https://cdn.resfu.com/img_data/equipos/64.png",
                info = "Club madrileño conocido por su desarrollo en el fútbol de base."
            ),
            Equipo(
                id = 22,
                nombre = "Ceuta",
                grupo = "Grupo 2",
                estadio = "Estadio Alfonso Murube",
                logo = "https://cdn.resfu.com/img_data/equipos/665.png",
                info = "Con un crecimiento significativo en el fútbol regional de Ceuta."
            ),
            Equipo(
                id = 23,
                nombre = "Mérida",
                grupo = "Grupo 2",
                estadio = "Estadio José Fouto",
                logo = "https://cdn.resfu.com/img_data/equipos/11989.png",
                info = "Equipo que busca revitalizar su legado en el fútbol extremeño."
            ),
            Equipo(
                id = 24,
                nombre = "Algeciras",
                grupo = "Grupo 2",
                estadio = "Estadio Nuevo Mirador",
                logo = "https://cdn.resfu.com/img_data/equipos/166.png",
                info = "Fútbol andaluz con una historia rica y un fuerte grupo de seguidores."
            ),
            Equipo(
                id = 25,
                nombre = "Antequera",
                grupo = "Grupo 2",
                estadio = "Estadio El Maulí",
                logo = "https://cdn.resfu.com/img_data/equipos/227.png",
                info = "Club en crecimiento en el fútbol andaluz, con grandes aspiraciones."
            ),
            Equipo(
                id = 26,
                nombre = "Atlético Sanluqueño",
                grupo = "Grupo 2",
                estadio = "Estadio El Palmar",
                logo = "https://cdn.resfu.com/img_data/equipos/333.png",
                info = "Famoso por su afición leal y su competitividad en cada partido."
            ),
            Equipo(
                id = 27,
                nombre = "Alcoyano",
                grupo = "Grupo 2",
                estadio = "Estadio El Collao",
                logo = "https://cdn.resfu.com/img_data/equipos/157.png",
                info = "Otro equipo de la Comunidad Valenciana que busca destacar."
            ),
            Equipo(
                id = 28,
                nombre = "Fuenlabrada",
                grupo = "Grupo 2",
                estadio = "Estadio Fernando Torres",
                logo = "https://cdn.resfu.com/img_data/equipos/1179.png",
                info = "Famoso por su enfoque en las categorías de base."
            ),
            Equipo(
                id = 29,
                nombre = "Intercity",
                grupo = "Grupo 2",
                estadio = "Estadio Municipal de Sant Joan",
                logo = "https://cdn.resfu.com/img_data/equipos/102474.png?size=35x&v=12",
                info = "Con una estructura moderna y ambiciones de ascenso."
            ),
            Equipo(
                id = 30,
                nombre = "Atlético B",
                grupo = "Grupo 2",
                estadio = "Cerro del Espino",
                logo = "https://cdn.resfu.com/img_data/equipos/323.png",
                info = "Equipo juvenil buscando talento en el Atlético de Madrid."
            ),
            Equipo(
                id = 31,
                nombre = "Hércules",
                grupo = "Grupo 2",
                estadio = "Estadio José Rico Pérez",
                logo = "https://cdn.resfu.com/img_data/equipos/1311.png",
                info = "Club con gran historia en el fútbol español y una fiel afición."
            ),
            Equipo(
                id = 32,
                nombre = "Marbella",
                grupo = "Grupo 2",
                estadio = "Estadio Municipal de Marbella",
                logo = "https://cdn.resfu.com/img_data/equipos/2565.png",
                info = "Buscando hacer un impacto en el fútbol andaluz."
            ),
            Equipo(
                id = 33,
                nombre = "Betis Deportivo",
                grupo = "Grupo 2",
                estadio = "Estadio Manuel Ruiz de Lopera",
                logo = "https://cdn.resfu.com/img_data/equipos/2099.png",
                info = "Filial del Real Betis, enfocándose en el desarrollo juvenil."
            ),
            Equipo(
                id = 34,
                nombre = "Castilla",
                grupo = "Grupo 2",
                estadio = "Estadio Alfredo Di Stéfano",
                logo = "https://cdn.resfu.com/img_data/equipos/2170.png",
                info = "Filial del Real Madrid, siendo una cantera de grandes talentos."
            ),
            Equipo(
                id = 35,
                nombre = "Real Murcia",
                grupo = "Grupo 2",
                estadio = "Estadio Nueva Condomina",
                logo = "https://cdn.resfu.com/img_data/equipos/2113.png",
                info = "Con una rica historia en el fútbol español, busca el ascenso."
            ),
            Equipo(
                id = 36,
                nombre = "Recreativo de Huelva",
                grupo = "Grupo 2",
                estadio = "Estadio Nuevo Colombino",
                logo = "https://cdn.resfu.com/img_data/equipos/2141.png",
                info = "Uno de los clubes más históricos del fútbol español, con una gran afición."
            ),
            Equipo(
                id = 37,
                nombre = "Sevilla Atlético",
                grupo = "Grupo 2",
                estadio = "Estadio Jesús Navas",
                logo = "https://cdn.resfu.com/img_data/equipos/2311.png",
                info = "Filial del Sevilla FC, enfocado en el desarrollo de jóvenes talentos."
            ),
            Equipo(
                id = 38,
                nombre = "Ibiza",
                grupo = "Grupo 2",
                estadio = "Estadio Can Misses",
                logo = "https://cdn.resfu.com/img_data/equipos/1352.png",
                info = "Club con un crecimiento notable y mucha esperanza en la categoría."
            ),
            Equipo(
                id = 39,
                nombre = "Villarreal B",
                grupo = "Grupo 2",
                estadio = "Estadio de la Cerámica",
                logo = "https://cdn.resfu.com/img_data/equipos/2717.png",
                info = "Filial del Villarreal CF, conocido por su apuesta en cantera."
            ),
            Equipo(
                id = 40,
                nombre = "Yeclano",
                grupo = "Grupo 2",
                estadio = "Estadio La Constitución",
                logo = "https://cdn.resfu.com/img_data/equipos/2774.png",
                info = "Club de Yecla con una rica historia en el fútbol murciano, buscando volver a las ligas profesionales."
            )
        )
    }
}