
package im.vinci.materialdesign.module;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GankBeautyResult {
    public boolean error;
    public @SerializedName("results") List<GankBeauty> beauties;
}
