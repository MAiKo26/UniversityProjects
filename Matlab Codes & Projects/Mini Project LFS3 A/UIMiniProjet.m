function varargout = UIMiniProjet(varargin)
% UIMINIPROJET MATLAB code for UIMiniProjet.fig
%      UIMINIPROJET, by itself, creates a new UIMINIPROJET or raises the existing
%      singleton*.
%
%      H = UIMINIPROJET returns the handle to a new UIMINIPROJET or the handle to
%      the existing singleton*.
%
%      UIMINIPROJET('CALLBACK',hObject,eventData,handles,...) calls the local
%      function named CALLBACK in UIMINIPROJET.M with the given input arguments.
%
%      UIMINIPROJET('Property','Value',...) creates a new UIMINIPROJET or raises the
%      existing singleton*.  Starting from the left, property value pairs are
%      applied to the GUI before UIMiniProjet_OpeningFcn gets called.  An
%      unrecognized property name or invalid value makes property application
%      stop.  All inputs are passed to UIMiniProjet_OpeningFcn via varargin.
%
%      *See GUI Options on GUIDE's Tools menu.  Choose "GUI allows only one
%      instance to run (singleton)".
%
% See also: GUIDE, GUIDATA, GUIHANDLES

% Edit the above text to modify the response to help UIMiniProjet

% Last Modified by GUIDE v2.5 10-Dec-2020 10:40:34

% Begin initialization code - DO NOT EDIT
gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @UIMiniProjet_OpeningFcn, ...
                   'gui_OutputFcn',  @UIMiniProjet_OutputFcn, ...
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


% --- Executes just before UIMiniProjet is made visible.
function UIMiniProjet_OpeningFcn(hObject, eventdata, handles, varargin)
% This function has no output args, see OutputFcn.
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
% varargin   command line arguments to UIMiniProjet (see VARARGIN)

% Choose default command line output for UIMiniProjet
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% UIWAIT makes UIMiniProjet wait for user response (see UIRESUME)
% uiwait(handles.figure1);


% --- Outputs from this function are returned to the command line.
function varargout = UIMiniProjet_OutputFcn(hObject, eventdata, handles) 
% varargout  cell array for returning output args (see VARARGOUT);
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Get default command line output from handles structure
varargout{1} = handles.output;


% --- Executes on button press in b3.
function b3_Callback(hObject, eventdata, handles)
MiniProjetPartie3 ;
% hObject    handle to b3 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)


% --- Executes on button press in b1.
function b1_Callback(hObject, eventdata, handles)
MiniProjetPartie1 ;

% hObject    handle to b1 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)


% --- Executes on button press in b2.
function b2_Callback(hObject, eventdata, handles)
MiniProjetPartie2 ;
% hObject    handle to b2 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
