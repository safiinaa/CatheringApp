package com.example.catheringapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;


import com.example.catheringapp.adapter.DatabaseModel;
import com.example.catheringapp.database.DatabaseClient;
import com.example.catheringapp.database.dao.DatabaseDao;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.schedulers.Schedulers;



public class RegisterViewModel extends AndroidViewModel {

    DatabaseDao databaseDao;

    //untuk inisialisasi databaseDao
    public RegisterViewModel(@NonNull Application application) {
        super(application);

        databaseDao = DatabaseClient.getInstance(application).getAppDatabase().databaseDao();
    }

    //untuk insert data sesuai dengan menu register
    public void addDataRegister(final String strEmail, final String strUsername,
                                final String strPassword) {
        Completable.fromAction(() -> {
                    DatabaseModel databaseModel = new DatabaseModel();
                    databaseModel.email = strEmail;
                    databaseModel.username = strUsername;
                    databaseModel.password = strPassword;
                    databaseDao.insertData(databaseModel);
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();
    }

}
