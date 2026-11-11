// Auto-generated stub from AIDL: lib/src/main/aidl/com/lody/virtual/server/IBinderDelegateService.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;

public interface IBinderDelegateService extends IInterface {
    public static abstract class Stub extends android.os.Binder implements IBinderDelegateService {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IBinderDelegateService";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IBinderDelegateService asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IBinderDelegateService) {
                return (IBinderDelegateService) iface;
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

        public static class Proxy implements IBinderDelegateService {
            private IBinder mRemote;
            public Proxy(IBinder remote) { mRemote = remote; }
            @Override public IBinder asBinder() { return mRemote; }
            public String getInterfaceDescriptor() { return DESCRIPTOR; }
        package com.lody.virtual.server
        
        
        
           ComponentName getComponent()
        
           IBinder getService()
        
        
        }
    }
}
