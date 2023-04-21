package i.dont.have.any.domains.Api;

import java.util.Optional;

/**
 * returnするインスタンスと処理結果、詳細メッセージを共に格納するクラス
 * 
 * @version 1.0.0
 * @author Rite
 */
public class ResultPack<E>{

    /**
     * 処理結果を表します。
     */
    static enum Type {
        SUCCESS,
        FAILED
    }

    /**
     * ResultPackインスタンスと共にreturnするインスタンス
     */
    private Optional<E> instance;

    /**
     * 処理結果
     */
    private Type type;

    /**
     * 処理結果の詳細メッセージ
     */
    private String resultMessage;

    /**
     * ResultPackインスタンスを取得します。
     * 共にreturnするインスタンスの型をジェネリクスで指定してください。
     * 
     * @param instance      共にreturnするインスタンス
     * @param type          処理結果
     * @param resultMessage 処理結果の詳細メッセージ
     */
    public ResultPack(final E instance, final Type type, final String resultMessage) {
        this.type = type;
        this.resultMessage = resultMessage;
    }

    /**
     * 共にreturnしたインスタンスを取得します。
     * 
     * @return 共にreturnしたインスタンス
     */
    public Optional<E> getInstance() {
        return instance;
    }

    /**
     * 処理結果を取得
     * 
     * @return 処理結果
     */
    public Type getType() {
        return type;
    }

    /**
     * 処理結果の詳細メッセージを取得します。
     * 
     * @return 処理結果の詳細メッセージ
     */
    public String getResultMessage() {
        return resultMessage;
    }

}
