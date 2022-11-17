package com.intel.trader.History;

import javax.persistence.*;

@Entity
public class History {

    String user_id;
    @Id
    String txn_id;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getTxn_id() {
        return txn_id;
    }

    public void setTxn_id(String txn_id) {
        this.txn_id = txn_id;
    }

    public String getTxn_memo() {
        return txn_memo;
    }

    public void setTxn_memo(String txn_memo) {
        this.txn_memo = txn_memo;
    }

    String txn_memo;

}
