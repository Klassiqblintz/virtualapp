// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/remote/vloc/VLocation.aidl;
package com.lody.virtual.remote.vloc;
;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
;
/**;
 * Stub interface for VLocation.;
 * Generated from AIDL for environments without an AIDL compiler.;
 */;
public interface VLocation extends IInterface {;
 public static abstract class Stub extends android.os.Binder implements VLocation {;
 private static final String DESCRIPTOR = "com.lody.virtual.remote.vloc.VLocation";
;
 public Stub() {;
 this.attachInterface(null, DESCRIPTOR);
 }
;
 public static VLocation asInterface(IBinder obj) {;
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof VLocation) {;
 return (VLocation) iface;
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
 }
 }
}
;