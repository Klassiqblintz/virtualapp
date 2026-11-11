// Auto-generated stub from AIDL: lib/src/main/aidl/android/app/job/IJobService.aidl;
package android.app.job;
;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
;
/**;
 * Stub interface for IJobService.;
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.;
 */;
public interface IJobService extends IInterface {;
 /** Local class (Binder subclass) */;
 public static abstract class Stub extends android.os.Binder implements IJobService {;
 private static final String DESCRIPTOR = "android.app.job.IJobService";
;
 public Stub() {;
 this.attachInterface(null, DESCRIPTOR);
 }
;
 public static IJobService asInterface(IBinder obj) {;
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IJobService) {;
 return (IJobService) iface;
 }
 return new Proxy(obj);
 }
;
 @Override
 public IBinder asBinder() {;
 return this;
 }
;
 @Override
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
 public static class Proxy implements IJobService {;
 private IBinder mRemote;
;
 public Proxy(IBinder remote) {;
 mRemote = remote;
 }
;
 @Override
 public IBinder asBinder() {;
 return mRemote;
 }
;
 public String getInterfaceDescriptor() {;
 return DESCRIPTOR;
 }
 package android.app.job;
;
;
 /**;
 * Interface that the framework uses to communicate with application code that implements a;
 * service implementation will extend android.app.job.JobService.;
 */;
 /** Begin execution of application's job. */;
 void startJob(in JobParameters jobParams);
 /** Stop execution of application's job. */;
 void stopJob(in JobParameters jobParams);
;
;
 @Override
 public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {;
 }
 }
 }
}
;
