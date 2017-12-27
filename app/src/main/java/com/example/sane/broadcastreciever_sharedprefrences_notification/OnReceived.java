package com.example.sane.broadcastreciever_sharedprefrences_notification;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Sane on 12/27/2017.
 */

public class OnReceived {

    Context context;
    Intent intent;

    public OnReceived(Context context, Intent intent) {
        this.context = context;
        this.intent = intent;
    }

}
