// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/content/ISyncContext.aidl
package android.content;

import android.os.IBinder;
import android.os.IInterface;
import android.content.SyncResult;

/**
 * Stub interface for ISyncContext.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface ISyncContext.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements ISyncContext.java {
 private static final String DESCRIPTOR = "android.content.ISyncContext.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static ISyncContext.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof ISyncContext.java) {
 return (ISyncContext.java) iface;
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

 public static class Proxy implements ISyncContext.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 /** * Call to indicate that the SyncAdapter is making progress. E.g., if this SyncAdapter * downloads or sends records to/from the server, this may be called after each record * is downloaded or uploaded. */ void sendHeartbeat();
 /** * Signal that the corresponding sync session is completed. * @param result information about this sync session */ void onFinished( SyncResult result);
 }
 }
}