import java.util.Scanner;

public class TicTacToe {

    private final String[][] board;
    static int ROWS = 3;
    static int COLUMNS = 3;
    static String player1 = "x";
    static String player2 = "o";

    public TicTacToe() {
        board = new String[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    public String toString() {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            r.append("|");
            for (int j = 0; j < COLUMNS; j++)
                r.append(board[i][j]);
            r.append("|\n");
        }
        return r.toString();
    }

    public void set(int i, int j, String player) {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    public String getWinner() {
        int x = 0;
        int o = 0;

        //Controllo vincitore su riga
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLUMNS; j++){
                switch(board[i][j]){
                    case "x" -> x++;
                    case "o" -> o++;
                    default -> {continue;}
                }
            }
            if(x == 3)
                return player1;
            else if(o == 3)
                return player2;
            else{
                x = 0;
                o = 0;
                continue;
            }
        }

        //Controllo vincitore su colonna
        for(int j = 0; j < COLUMNS; j++){
            for(int i = 0; i < ROWS; i++){
                switch(board[i][j]){
                    case "x" -> x++;
                    case "o" -> o++;
                    default -> {continue;}
                }
            }
            if(x == 3)
                return player1;
            else if(o == 3)
                return player2;
                else{
                x = 0;
                o = 0;
                continue;
            }
        }

        //Controllo vincitore su diagonale 1
        for(int i = 0, j = 0; i < ROWS; i++, j++){
            switch(board[i][j]){
                case "x" -> x++;
                case "o" -> o++;
                default -> {continue;}
            }
        }
        if(x == 3)
            return player1;
        else if(o == 3)
            return player2;
        else{
            x = 0;
            o = 0;
        }

        //Controllo vincitore su diagonale 2
        for(int i = 0, j = 2; i < COLUMNS; i++, j--){
            switch(board[i][j]){
                case "x" -> x++;
                case "o" -> o++;
                default -> {continue;}
            }
        }
        if(x == 3)
            return player1;
        else if(o == 3)
            return player2;
        else{
            x = 0;
            o = 0;
        }
        return "Nessun Vincitore";
    }

    public static void main(String[] args) {
        String player = player1;
        TicTacToe game = new TicTacToe();
        Scanner in = new Scanner(System.in);
        int row, column;
        System.out.println(game);

        do {

            if (game.getWinner().equals(player1) || game.getWinner().equals(player2)) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci riga per " + player + " (-1 per uscire):");
            row = in.nextInt();

            if (row == -1) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci colonna per " + player + ":");
            column = in.nextInt();

            if (row >= ROWS || column >= COLUMNS) {
                System.out.println("Combinazione non valida");
            } else {
                // Set value on the board
                game.set(row, column, player);

                // Draw board
                System.out.println(game);

                // Get winnner
                System.out.println("Vince: " + game.getWinner());

                // Change player
                if (player.equals(player1)) {
                    player = player2;
                } else {
                    player = player1;
                }
            }

        } while (row < ROWS && column < COLUMNS);
    }
}