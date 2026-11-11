// Auto-generated stub from AIDL: lib/src/main/aidl/android/content/ISyncContext.aidl
package android.content;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/**
 * Stub interface for ISyncContext.
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.
 */
public interface ISyncContext extends IInterface {
    /** Local class (Binder subclass) */
    public static abstract class Stub extends android.os.Binder implements ISyncContext {
        private static final String DESCRIPTOR = "android.content.ISyncContext";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static ISyncContext asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof ISyncContext) {
                return (ISyncContext) iface;
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

        public static class Proxy implements ISyncContext {
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
             * Copyright (C) 2008 The Android Open Source Project
             *
             * Licensed under the Apache License, Version 2.0 (the "License");
             * you may not use this file except in compliance with the License.
             * You may obtain a copy of the License at
             *
             *      http://www.apache.org/licenses/LICENSE-2.0
             *
             * Unless required by applicable law or agreed to in writing, software
             * distributed under the License is distributed on an "AS IS" BASIS,
             * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
             * See the License for the specific language governing permissions and
             * limitations under the License.
             */
            
            package android.content;
            
            
            /**
             * Interface used by the SyncAdapter to indicate its progress.
             * @hide
             */
                /**
                 * Call to indicate that the SyncAdapter is making progress. E.g., if this SyncAdapter
                 * downloads or sends records to/from the server, this may be called after each record
                 * is downloaded or uploaded.
                 */
                void sendHeartbeat();
            
                /**
                 * Signal that the corresponding sync session is completed.
                 * @param result information about this sync session
                 */
                void onFinished(in SyncResult result);
            ;

            @Override
            public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {
            }
        }
    }
}
