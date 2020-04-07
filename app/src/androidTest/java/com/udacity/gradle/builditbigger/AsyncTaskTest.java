package com.udacity.gradle.builditbigger;

import android.util.Log;

import com.udacity.gradle.builditbigger.utils.EndpointsAsyncTask;

import org.junit.Rule;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.fail;

public class AsyncTaskTest {

    @Test
    public void testAsyncTask() {
        try {
            // 1- Execute the asyncTask in order to retrieve a joke
            EndpointsAsyncTask endpointsAsyncTask = (EndpointsAsyncTask) new EndpointsAsyncTask(new EndpointsAsyncTask.Listener() {
                @Override
                public void onTaskComplete(String result) {
                }
            }).execute();

            // 2- Get the joke retrieved
            // get() method of AsyncTask is explained here https://developer.android.com/reference/android/os/AsyncTask#get()
            String joke = endpointsAsyncTask.get();
            Log.d("AsyncTaskTest", joke);

            // 3- Assert it is not null
            assertNotNull(joke);

        } catch (Exception e) {
            fail("An error happens while fetching joke: " + e.getMessage());
        }
    }
}
