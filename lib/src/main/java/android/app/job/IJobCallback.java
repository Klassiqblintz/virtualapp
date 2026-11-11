// Auto-generated stub from AIDL: lib/src/main/aidl/android/app/job/IJobCallback.aidl
package android.app.job;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/**
 * Stub interface for IJobCallback.
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.
 */
public interface IJobCallback extends IInterface {
    /** Local class (Binder subclass) */
    public static abstract class Stub extends android.os.Binder implements IJobCallback {
        private static final String DESCRIPTOR = "android.app.job.IJobCallback";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IJobCallback asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IJobCallback) {
                return (IJobCallback) iface;
            }
            return new Proxy(obj);
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws android.os.RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION:
                    reply.writeString(DESCRIPTOR);
                    return true;
                case NEEDS_DEFAULT_TRANSACTION:
                    return onTransact(code, data, reply, flags);
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        public static class Proxy implements IJobCallback {
            private IBinder mRemote;

            public Proxy(IBinder remote) {
                mRemote = remote;
            }

            @Override
            public IBinder asBinder() {
                return mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }
            /**
             * Copyright 2014, The Android Open Source Project
             *
             * Licensed under the Apache License, Version 2.0 (the "License");
             * you may not use this file except in compliance with the License.
             * You may obtain a copy of the License at
             *
             *     http://www.apache.org/licenses/LICENSE-2.0
             *
             * Unless required by applicable law or agreed to in writing, software
             * distributed under the License is distributed on an "AS IS" BASIS,
             * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
             * See the License for the specific language governing permissions and
             * limitations under the License.
             */
            
            package android.app.job;
            
            /**
             * The server side of the JobScheduler IPC protocols.  The app-side implementation
             * issued by the server.
             *
             * In all cases, the 'who' parameter is the caller's service binder, used to track
             * which Job Service instance is reporting.
             *
             */
                /**
                 * Immediate callback to the system after sending a start signal, used to quickly detect ANR.
                 *
                 * @param jobId Unique integer used to identify this job.
                 * @param ongoing True to indicate that the client is processing the job. False if the job is
                 * complete
                 */
                void acknowledgeStartMessage(int jobId, boolean ongoing);
                /**
                 * Immediate callback to the system after sending a stop signal, used to quickly detect ANR.
                 *
                 * @param jobId Unique integer used to identify this job.
                 * @param reschedule Whether or not to reschedule this job.
                 */
                void acknowledgeStopMessage(int jobId, boolean reschedule);
                /*
                 * Tell the job manager that the client is done with its execution, so that it can go on to
                 * the next one and stop attributing wakelock time to us etc.
                 *
                 * @param jobId Unique integer used to identify this job.
                 * @param reschedule Whether or not to reschedule this job.
                 */
                void jobFinished(int jobId, boolean reschedule);
            ;

            @Override
            public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {
            }
        }
    }
}
