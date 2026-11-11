// Auto-generated stub from AIDL: lib/src/main/aidl/com/lody/virtual/server/interfaces/IAppRequestListener.aidl
package com.lody.virtual.server.interfaces;

import android.os.IBinder;
import android.os.IInterface;

public interface IAppRequestListener extends IInterface {
    public static abstract class Stub extends android.os.Binder implements IAppRequestListener {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IAppRequestListener";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IAppRequestListener asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IAppRequestListener) {
                return (IAppRequestListener) iface;
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

        public static class Proxy implements IAppRequestListener {
            private IBinder mRemote;
            public Proxy(IBinder remote) { mRemote = remote; }
            @Override public IBinder asBinder() { return mRemote; }
            public String getInterfaceDescriptor() { return DESCRIPTOR; }
        package com.lody.virtual.server.interfaces
        
            void onRequestInstall(in String path)
            void onRequestUninstall(in String pkg)
        
        }
    }
}
