// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/server/interfaces/IServiceFetcher.aidl;
package com.lody.virtual.server.interfaces;
;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
;
/**;
 * Stub interface for IServiceFetcher.;
 * Generated from AIDL for environments without an AIDL compiler.;
 */;
public interface IServiceFetcher extends IInterface {;
 public static abstract class Stub extends android.os.Binder implements IServiceFetcher {;
 private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IServiceFetcher";
;
 public Stub() {;
 this.attachInterface(null, DESCRIPTOR);
 }
;
 public static IServiceFetcher asInterface(IBinder obj) {;
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IServiceFetcher) {;
 return (IServiceFetcher) iface;
 }
 return new Proxy(obj);
 }
;
 @Override;
 public IBinder asBinder() { return this; }
;
 @Override;
 public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {;
 switch (code) {;
 case android.os.IBinder.INTERFACE_TRANSACTION:;
 reply.writeString(DESCRIPTOR);
 return true;
 default:;
 return super.onTransact(code, data, reply, flags);
 }
 }
;
 public static class Proxy implements {classname} {{;
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 IBinder getService(String name);
 void addService(String name, IBinder service);
 void removeService(String name);
 }
 }
}
;