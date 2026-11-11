// Auto-generated stub from AIDL: lib/src/main/aidl/com/lody/virtual/server/IPackageInstallerSession.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;

public interface IPackageInstallerSession extends IInterface {
    public static abstract class Stub extends android.os.Binder implements IPackageInstallerSession {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IPackageInstallerSession";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IPackageInstallerSession asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IPackageInstallerSession) {
                return (IPackageInstallerSession) iface;
            }
            return new Proxy(obj);
        }

        @Override
        public IBinder asBinder() { return this; }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            switch (code) {
                case android.os.IBinder.INTERFACE_TRANSACTION:
                    reply.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        public static class Proxy implements IPackageInstallerSession {
            private IBinder mRemote;
            public Proxy(IBinder remote) { mRemote = remote; }
            @Override public IBinder asBinder() { return mRemote; }
            public String getInterfaceDescriptor() { return DESCRIPTOR; }
        package com.lody.virtual.server
        
        
            void setClientProgress(float progress)
            void addClientProgress(float progress)
        
            String[] getNames()
            ParcelFileDescriptor openWrite(String name, long offsetBytes, long lengthBytes)
            ParcelFileDescriptor openRead(String name)
            void close()
            void commit(in IntentSender statusReceiver)
            void abandon()
        
        }
    }
}
