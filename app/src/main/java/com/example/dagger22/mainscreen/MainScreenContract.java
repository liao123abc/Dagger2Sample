package com.example.dagger22.mainscreen;

/**
 * Created by liaodongming on 2016/11/24.
 */

import com.example.dagger22.data.Post;

import java.util.List;

/**
 * This interface will have two more inner interface called View and Presenter
 View interface holds all the methods which we will implement in our MainScreen View (i.e in our case Main4Activity)
 Presenter interface has all the methods that we will implement in our MainScreenPresenter (i.e only one method loadPost())
 */
public interface MainScreenContract {
    interface View {
        void showPost(List<Post> posts);
        void showError(String message);
        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}
