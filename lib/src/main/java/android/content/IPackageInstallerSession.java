// Auto-generated stub from AIDL: lib/src/main/aidl/android/content/pm/IPackageInstallerSession.aidl;
package android.content.pm;
;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
;
/**;
 * Stub interface for IPackageInstallerSession.;
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.;
 */;
public interface IPackageInstallerSession extends IInterface {;
 /** Local class (Binder subclass) */;
 public static abstract class Stub extends android.os.Binder implements IPackageInstallerSession {;
 private static final String DESCRIPTOR = "android.content.pm.IPackageInstallerSession";
;
 public Stub() {;
 this.attachInterface(null, DESCRIPTOR);
 }
;
 public static IPackageInstallerSession asInterface(IBinder obj) {;
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IPackageInstallerSession) {;
 return (IPackageInstallerSession) iface;
 }
 return new Proxy(obj);
 }
;
 @Override;
 public IBinder asBinder() {;
 return this;
 }
;
 @Override;
 public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws android.os.RemoteException {;
 switch (code) {;
 case INTERFACE_TRANSACTION:;
 reply.writeString(DESCRIPTOR);
 return true;
 case NEEDS_DEFAULT_TRANSACTION:;
 return onTransact(code, data, reply, flags);
 default:;
 return super.onTransact(code, data, reply, flags);
 }
 }
;
 public static class Proxy implements IPackageInstallerSession {;
 private IBinder mRemote;
;
 public Proxy(IBinder remote) {;
 mRemote = remote;
 }
;
 @Override;
 public IBinder asBinder() {;
 return mRemote;
 }
;
 public String getInterfaceDescriptor() {;
 return DESCRIPTOR;
 }
 package android.content.pm;
;
;
 void setClientProgress(float progress);
 void addClientProgress(float progress);
;
 String[] getNames();
 ParcelFileDescriptor openWrite(String name, long offsetBytes, long lengthBytes);
 ParcelFileDescriptor openRead(String name);
;
 void removeSplit(String splitName);
;
 void close();
 void commit(in IntentSender statusReceiver);
 void abandon();
;
;
 @Override;
 public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {;
 }
 }
 }
}
;