// Auto-generated stub from AIDL: lib/src/main/aidl/com/lody/virtual/server/IVirtualLocationManager.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;

public interface IVirtualLocationManager extends IInterface {
    public static abstract class Stub extends android.os.Binder implements IVirtualLocationManager {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IVirtualLocationManager";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IVirtualLocationManager asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IVirtualLocationManager) {
                return (IVirtualLocationManager) iface;
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

        public static class Proxy implements IVirtualLocationManager {
            private IBinder mRemote;
            public Proxy(IBinder remote) { mRemote = remote; }
            @Override public IBinder asBinder() { return mRemote; }
            public String getInterfaceDescriptor() { return DESCRIPTOR; }
        package com.lody.virtual.server
        
        
        
            int getMode(int userId, in String pkg)
            void setMode(int userId, in String pkg, int mode)
        
            void setCell(in int userId, in String pkg, in VCell cell)
            void setAllCell(in int userId, in String pkg, in List<VCell> cell)
            void setNeighboringCell(in int userId, in String pkg, in List<VCell> cell)
        
            void setGlobalCell(in VCell cell)
            void setGlobalAllCell(in List<VCell> cell)
            void setGlobalNeighboringCell(in List<VCell> cell)
        
            VCell getCell(in int userId, in String pkg)
            List<VCell> getAllCell(in int userId, in String pkg)
            List<VCell> getNeighboringCell(in int userId, in String pkg)
        
            void setLocation(in int userId, in String pkg, in VLocation loc)
            VLocation getLocation(in int userId, in String pkg)
        
            void setGlobalLocation(in VLocation loc)
            VLocation getGlobalLocation()
        
        }
    }
}
