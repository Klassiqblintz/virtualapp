// Auto-generated stub from AIDL: lib/src/main/aidl/com/lody/virtual/client/IVClient.aidl
package com.lody.virtual.client;

import android.os.IBinder;
import android.os.IInterface;

public interface IVClient extends IInterface {
    public static abstract class Stub extends android.os.Binder implements IVClient {
        private static final String DESCRIPTOR = "com.lody.virtual.client.IVClient";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IVClient asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IVClient) {
                return (IVClient) iface;
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

        public static class Proxy implements IVClient {
            private IBinder mRemote;
            public Proxy(IBinder remote) { mRemote = remote; }
            @Override public IBinder asBinder() { return mRemote; }
            public String getInterfaceDescriptor() { return DESCRIPTOR; }
        package com.lody.virtual.client
        
        
        
            void scheduleReceiver(in String processName,in ComponentName component, in Intent intent, in PendingResultData resultData)
            void scheduleNewIntent(in String creator, in IBinder token, in Intent intent)
            void finishActivity(in IBinder token)
            IBinder createProxyService(in ComponentName component, in IBinder binder)
            IBinder acquireProviderClient(in ProviderInfo info)
            IBinder getAppThread()
            IBinder getToken()
            String getDebugInfo()
        
        }
    }
}
