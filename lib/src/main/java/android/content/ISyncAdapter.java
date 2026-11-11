// Auto-generated stub from AIDL: lib/src/main/aidl/android/content/ISyncAdapter.aidl
package android.content;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/**
 * Stub interface for ISyncAdapter.
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.
 */
public interface ISyncAdapter extends IInterface {
    /** Local class (Binder subclass) */
    public static abstract class Stub extends android.os.Binder implements ISyncAdapter {
        private static final String DESCRIPTOR = "android.content.ISyncAdapter";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static ISyncAdapter asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof ISyncAdapter) {
                return (ISyncAdapter) iface;
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

        public static class Proxy implements ISyncAdapter {
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
             * Interface used to control the sync activity on a SyncAdapter
             */
                /**
                 * Initiate a sync for this account. SyncAdapter-specific parameters may
                 * be specified in extras, which is guaranteed to not be null.
                 *
                 * @param syncContext the ISyncContext used to indicate the progress of the sync. When
                 *   the sync is finished (successfully or not) ISyncContext.onFinished() must be called.
                 * @param authority the authority that should be synced
                 * @param account the account that should be synced
                 * @param extras SyncAdapter-specific parameters
                 */
                void startSync(ISyncContext syncContext, String authority,
                  in Account account, in Bundle extras);
            
                /**
                 * Cancel the most recently initiated sync. Due to race conditions, this may arrive
                 * after the ISyncContext.onFinished() for that sync was called.
                 * @param syncContext the ISyncContext that was passed to ;@link #startSync;
                 */
                void cancelSync(ISyncContext syncContext);
            
                /**
                 * Initialize the SyncAdapter for this account and authority.
                 *
                 * @param account the account that should be synced
                 * @param authority the authority that should be synced
                 */
                void initialize(in Account account, String authority);
            ;

            @Override
            public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {
            }
        }
    }
}
