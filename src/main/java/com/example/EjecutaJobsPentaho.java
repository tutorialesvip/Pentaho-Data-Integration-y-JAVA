package com.example;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.job.Job;
import org.pentaho.di.job.JobMeta;

public class EjecutaJobsPentaho {

    public static void main(String[] args) throws KettleException {

        KettleEnvironment.init();
        JobMeta jobMeta = new JobMeta("C:\\Users\\Odesto-Lenovo\\Desktop\\Pentaho_Insert\\Insert.kjb",null);
        Job job = new Job(null,jobMeta);
        job.start();
        job.waitUntilFinished();

        if (job.getErrors() > 0){
            System.out.println("Ocurrio un error");
        }
    }
}
