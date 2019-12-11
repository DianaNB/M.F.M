package org.launchcode.MFM.controllers;

import org.launchcode.MFM.models.data.PlaylistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PlaylistController {
    @Autowired private PlaylistDao playlistDao;
}
