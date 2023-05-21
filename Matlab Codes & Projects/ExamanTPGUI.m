function varargout = ExamanTPGUI(varargin)
% EXAMANTPGUI MATLAB code for ExamanTPGUI.fig
%      EXAMANTPGUI, by itself, creates a new EXAMANTPGUI or raises the existing
%      singleton*.
%
%      H = EXAMANTPGUI returns the handle to a new EXAMANTPGUI or the handle to
%      the existing singleton*.
%
%      EXAMANTPGUI('CALLBACK',hObject,eventData,handles,...) calls the local
%      function named CALLBACK in EXAMANTPGUI.M with the given input arguments.
%
%      EXAMANTPGUI('Property','Value',...) creates a new EXAMANTPGUI or raises the
%      existing singleton*.  Starting from the left, property value pairs are
%      applied to the GUI before ExamanTPGUI_OpeningFcn gets called.  An
%      unrecognized property name or invalid value makes property application
%      stop.  All inputs are passed to ExamanTPGUI_OpeningFcn via varargin.
%
%      *See GUI Options on GUIDE's Tools menu.  Choose "GUI allows only one
%      instance to run (singleton)".
%
% See also: GUIDE, GUIDATA, GUIHANDLES

% Edit the above text to modify the response to help ExamanTPGUI

% Last Modified by GUIDE v2.5 19-Apr-2021 09:04:18

% Begin initialization code - DO NOT EDIT
gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @ExamanTPGUI_OpeningFcn, ...
                   'gui_OutputFcn',  @ExamanTPGUI_OutputFcn, ...
                   'gui_LayoutFcn',  [] , ...
                   'gui_Callback',   []);
if nargin && ischar(varargin{1})
    gui_State.gui_Callback = str2func(varargin{1});
end

if nargout
    [varargout{1:nargout}] = gui_mainfcn(gui_State, varargin{:});
else
    gui_mainfcn(gui_State, varargin{:});
end
% End initialization code - DO NOT EDIT


% --- Executes just before ExamanTPGUI is made visible.
function ExamanTPGUI_OpeningFcn(hObject, eventdata, handles, varargin)
% This function has no output args, see OutputFcn.
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
% varargin   command line arguments to ExamanTPGUI (see VARARGIN)


% Choose default command line output for ExamanTPGUI
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% UIWAIT makes ExamanTPGUI wait for user response (see UIRESUME)
% uiwait(handles.figure1);


% --- Outputs from this function are returned to the command line.
function varargout = ExamanTPGUI_OutputFcn(hObject, eventdata, handles) 
% varargout  cell array for returning output args (see VARARGOUT);
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Get default command line output from handles structure
varargout{1} = handles.output;


% --- Executes on button press in pushbutton1.
function pushbutton1_Callback(hObject, eventdata, handles)
% hObject    handle to pushbutton1 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
global I
I = imread('fleur.jpeg');
axes(handles.axes1) ;
imshow(I) ;



% --- Executes on button press in pushbutton2.
function pushbutton2_Callback(hObject, eventdata, handles)
% hObject    handle to pushbutton2 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
global I
I = rgb2gray(I) ;
axes(handles.axes1) ;
imshow(I) ;


% --- Executes on button press in pushbutton3.
function pushbutton3_Callback(hObject, eventdata, handles)
% hObject    handle to pushbutton3 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
global I
axes(handles.axes2);
imhist(I) ;

% --- Executes on button press in pushbutton4.
function pushbutton4_Callback(hObject, eventdata, handles)
% hObject    handle to pushbutton4 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
global I
I = histeq(I) ;
axes(handles.axes1);
imshow(I) ;
axes(handles.axes2);
imhist(I) ;

% --- Executes on button press in pushbutton5.
function pushbutton5_Callback(hObject, eventdata, handles)
% hObject    handle to pushbutton5 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
global I

for i=3:12
    if i==3
        I = medfilt2(I, [3 3]) ;
        axes(handles.axes1);
        imshow(I) ;
        axes(handles.axes2);
        imhist(I) ;        
    end
    if i==5
        I = medfilt2(I, [5 5]) ;
        axes(handles.axes1);
        imshow(I) ;
        axes(handles.axes2);
        imhist(I) ; 
    end
    if i==7
        I = medfilt2(I, [7 7]) ;
        axes(handles.axes1);
        imshow(I) ;
        axes(handles.axes2);
        imhist(I) ; 
    end
    if i==11
        I = medfilt2(I, [11 11]) ;
        axes(handles.axes1);
        imshow(I) ;
        axes(handles.axes2);
        imhist(I) ; 
    end
end

% --- Executes on button press in pushbutton6.
function pushbutton6_Callback(hObject, eventdata, handles)
% hObject    handle to pushbutton6 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
global I
c = 20 ;
for i=1:18
 IR1 = imrotate(I,c) ;
 axes(handles.axes1);
 imshow(IR1) ; 
 c= c + 20 ;
end
