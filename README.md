

# TresEnRaya — Juego de Tic-Tac-Toe con IA (Minimax)
**Inteligencia Artificial (INF-418)**

**TresEnRaya** desarrollada en **Java 8** con interfaz grafica **Swing** el jugador humano se enfrenta a una inteligencia artificial que utiliza el algoritmo **Minimax** para decidir sus movimientos, con un nivel de dificultad configurable.

**Constantes principales:**
- `0` = casilla vacia
- `MAX = 1` — Representa a la maquina (jugador maximizador)
- `MIN = 2` — Representa al humano (jugador minimizador)
- `nivel` — Profundidad de busqueda del Minimax (dificultad)

**Metodos auxiliares:**
- `finDelJuego()` — Determina si el juego ha terminado (alguien gano o el tablero está lleno)
- `existeGanador()` — Retorna qué jugador gano (1, 2) o 0/-1 si hay empate o no hay ganador
- `reglasAplicables()` — Genera la lista de movimientos legales (casillas vacias)
- `aplicarRegla()` — Aplica un movimiento a una copia del tablero (para exploración hipotetica)
- `clonarTablero()` — Clona profundo el tablero para la exploración de estados
- `casosFavorables()` — Cuenta las lineas favorables para un jugador

## Requisitos del Sistema
- **Java Development Kit (JDK) 8** o superior

## Compilacion y Ejecución

Abrir el proyecto en NetBeans y presionar **F6**