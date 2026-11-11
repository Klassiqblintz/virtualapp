// Auto-generated stub from AIDL: lib/src/main/aidl/android/app/IStopUserCallback.aidl
package android.app;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/**
 * Stub interface for IStopUserCallback.
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.
 */
public interface IStopUserCallback extends IInterface {
    /** Local class (Binder subclass) */
    public static abstract class Stub extends android.os.Binder implements IStopUserCallback {
        private static final String DESCRIPTOR = "android.app.IStopUserCallback";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IStopUserCallback asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IStopUserCallback) {
                return (IStopUserCallback) iface;
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

        public static class Proxy implements IStopUserCallback {
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
            /*
            ** Copyright 2012, The Android Open Source Project
            **
            ** Licensed under the Apache License, Version 2.0 (the "License");
            ** you may not use this file except in compliance with the License.
            ** You may obtain a copy of the License at
            **
            **     http://www.apache.org/licenses/LICENSE-2.0
            **
            ** Unless required by applicable law or agreed to in writing, software
            ** distributed under the License is distributed on an "AS IS" BASIS,
            ** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            ** See the License for the specific language governing permissions and
            ** limitations under the License.
            */
            
            package android.app;
            
            /**
             * Callback to find out when we have finished stopping a user.
             * ;@hide;
             */
            ;
                void userStopped(int userId);
                void userStopAborted(int userId);
            ;

            @Override
            public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {
            }
        }
    }
}
