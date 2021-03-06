/*
 * Copyright 2017 Bubblebear Apps Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.co.bubblebearapps.motionaiclient.entity;

import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by joefr_000 on 23/01/2017.
 */
public class CardEntity {


    @Nullable
    @SerializedName("_id")
    private String id;

    @Nullable
    @SerializedName("cardSubtitle")
    private String subTitle;
    @Nullable
    @SerializedName("cardTitle")

    private String title;
    @Nullable
    @SerializedName("cardLink")
    private String url;
    @Nullable
    @SerializedName("cardImage")
    private String imageUrl;
    @Nullable
    @SerializedName("buttons")
    private CardEntityButton[] buttons;

    @Nullable
    public String getId() {
        return id;
    }

    public CardEntity setId(@Nullable String id) {
        this.id = id;
        return this;
    }

    @Nullable
    public String getSubTitle() {
        return subTitle;
    }

    public CardEntity setSubTitle(@Nullable String subTitle) {
        this.subTitle = subTitle;
        return this;
    }

    @Nullable
    public String getTitle() {
        return title;
    }

    public CardEntity setTitle(@Nullable String title) {
        this.title = title;
        return this;
    }

    @Nullable
    public String getUrl() {
        return url;
    }

    public CardEntity setUrl(@Nullable String url) {
        this.url = url;
        return this;
    }

    @Nullable
    public String getImageUrl() {
        return imageUrl;
    }

    public CardEntity setImageUrl(@Nullable String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    @Nullable
    public CardEntityButton[] getButtons() {
        return buttons;
    }

    public CardEntity setButtons(@Nullable CardEntityButton[] buttons) {
        this.buttons = buttons;
        return this;
    }

}
