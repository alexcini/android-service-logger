package br.com.heiderlopes.loggerservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;


public class Logger extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("Servico de Mensagem", "*** --- Serviço iniciado--- ***");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Servico de Mensagem", "*** --- Serviço finalizado --- ***");
    }
}
