package com.example;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.logging.LogLevel;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

public class EjecutarTransformaciones {

    public static void main(String[] args) throws KettleException {

        KettleEnvironment.init();
        TransMeta transMeta = new TransMeta("C:\\Users\\Odesto-Lenovo\\Desktop\\Pentaho_Insert\\dgdfd.ktr");
        Trans trans = new Trans(transMeta);
        trans.setLogLevel(LogLevel.ERROR);
        trans.execute(null);
        trans.waitUntilFinished();

        if(trans.getErrors() > 0){
            System.out.println("Ocurrio un error");
        }

    }
}
