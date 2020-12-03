package TryCatchGyaksi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChessFieldController {
    public void readFile(String filePath) throws InvalidChessBoardException {
        String[][] chessField = new String[8][8];
        Scanner scan;
        try {
            scan = new Scanner(new File(filePath));
            int line = 0;
            try {
                while (scan.hasNextLine()) {
                    String[] fieldsInLine = scan.nextLine().split(",");
                    if (fieldsInLine.length != 8) {
                        throw new InvalidChessBoardException("Nincs elég mező a sorban, nem sakktábla");
                    }
                    for (String s : fieldsInLine) {
                        if (!s.matches("[/u265C/u265E/u265D/u265B/u265A]")) {
                            throw new InvalidChessBoardException("Nem csak sakk karakterek vannak a fájlban");
                        }
                    }
                    chessField[line] = fieldsInLine;
                    line++;
                }
            } catch (IllegalStateException e) {
                System.out.println("A fájl üres vagy olvashatatlan");
            }
            if (line != 7) {
                throw new InvalidChessBoardException("Nincs elég sor a dáblán");
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("A fájl nem található");
        }

    }
}

