package i.dont.have.any.domains.Api;

import java.util.Scanner;

/**
 * このクラスは、入力処理用のstaticメソッドを提供します。
 * 
 * @version 1.1
 * @author Rite
 */
public class InputsUtilities {

    /**
     * このクラスはnewして使用するとパフォーマンスが低下するので、newを禁じています。
     */
    private InputsUtilities(){}
    /**
     * 実行する環境で使用されている改行コードを取得します。
     */
    public static final String BR = System.lineSeparator();

    /**
     * 標準入力のScannerインスタンスを取得します。
     */
    public static final Scanner SCANNER = new Scanner(System.in , "SHIFT-JIS");

    /**
     * YもしくはNの入力を受け付け、それに応じたboolean型の戻り値を返すメソッドです。
     * YもしくはNの入力は、大文字かどうかは問いません。
     * YかNが入力されるまで処理を終了することはありません。
     * 
     * @param promptMessage                 入力を促す際に表示するメッセージ
     * @param messageWhenInputWasUnexpected 入力がYもしくはNでなかった場合に表示するメッセージ
     * @return 入力がYならtrue、Nならfalse
     */
    public static boolean acceptInputByY_Or_N(final String promptMessage, final String messageWhenInputWasUnexpected) {
        System.out.println(promptMessage);
        String input = null;
        while (true) {
            if ((input = SCANNER.nextLine().toLowerCase()).matches("[yn]")) { // まずinputにSCANNER.NextLine()をtoLowerCase()した結果を代入し、yかnであるかを正規表現でチェック
                if (input.equals("y")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println(messageWhenInputWasUnexpected);
                continue;
            }
        }
    }

    /**
     * YもしくはNの入力を受け付け、それに応じたboolean型の戻り値を返すメソッドです。
     * YもしくはNの入力は、大文字かどうかは問いません。
     * YかNが入力されるまで処理を終了することはありません。
     * 
     * @param promptMessage 入力を促す際に表示するメッセージ
     * @return 入力がYならtrue、Nならfalse
     */
    public static boolean acceptInputByY_Or_N(final String promptMessage) {
        return acceptInputByY_Or_N(promptMessage, ">yかnを入力してください。");
    }
}
