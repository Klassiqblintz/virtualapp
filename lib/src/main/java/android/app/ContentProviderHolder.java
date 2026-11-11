// Auto-generated stub from AIDL: ContentProviderHolder is a parcelable;
package android.app;
;
import android.os.Parcel;
import android.os.Parcelable;
;
/**;
 * Parcelabler for ContentProviderHolder.;
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.;
 */;
public class ContentProviderHolder implements Parcelable {;
 public android.content.pm.ProviderInfo providerInfo;
 public android.os.IBinder binder;
;
 public ContentProviderHolder() {}
;
 @Override;
 public void writeToParcel(Parcel dest, int flags) {}
;
 @Override;
 public int describeContents() { return 0; }
;
 public static final Creator<ContentProviderHolder> CREATOR = new Creator<ContentProviderHolder>() {;
 @Override;
 public ContentProviderHolder createFromParcel(Parcel in) { return null; }
 @Override;
 public ContentProviderHolder[] newArray(int size) { return new ContentProviderHolder[size]; }
 };
}
;