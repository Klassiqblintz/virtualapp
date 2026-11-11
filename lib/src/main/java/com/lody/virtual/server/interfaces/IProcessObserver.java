// Auto-generated stub from AIDL: lib/src/main/aidl/com/lody/virtual/server/interfaces/IProcessObserver.aidl
package com.lody.virtual.server.interfaces;

import android.os.IBinder;
import android.os.IInterface;

public interface IProcessObserver extends IInterface {
    public static abstract class Stub extends android.os.Binder implements IProcessObserver {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IProcessObserver";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IProcessObserver asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IProcessObserver) {
                return (IProcessObserver) iface;
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

        public static class Proxy implements IProcessObserver {
            private IBinder mRemote;
            public Proxy(IBinder remote) { mRemote = remote; }
            @Override public IBinder asBinder() { return mRemote; }
            public String getInterfaceDescriptor() { return DESCRIPTOR; }
        package com.lody.virtual.server.interfaces
        
            void onProcessCreated(in String pkg, in String processName)
        
            void onProcessDied(in String pkg, in String processName)
        
        }
    }
}
